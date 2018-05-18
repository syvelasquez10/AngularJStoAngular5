import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Phone } from './model/Phone';

import { Observable } from 'rxjs/observable';
import { of } from 'rxjs/observable/of';
import { filter, map, tap } from 'rxjs/operators';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class PhoneService {

  private phonesUrl = 'api/phones';  // URL to web api

  constructor(private http: HttpClient) { }

  getPhones(): Observable<Phone[]> {
    return this.http.get<Phone[]>(this.phonesUrl);
  }

  /** GET hero by id. Will 404 if id not found */
  getPhone(id: number): Observable<Phone> {
    const url = `${this.phonesUrl}/${id}`;
    return this.http.get<Phone>(url);
  }

  /* GET heroes whose name contains search term */
  searchHeroes(term: string): Observable<Phone[]> {
    if (!term.trim()) {
      // if not search term, return empty hero array.
      return of([]);
    }
    return this.http.get<Phone[]>(`${this.phonesUrl}/?name=${term}`);
  }
}
