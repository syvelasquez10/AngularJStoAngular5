import { Component, OnInit } from '@angular/core';
import { PhoneService } from '../phone.service';
import { Phone } from '../model/Phone';

@Component({
  selector: 'app-phone-list',
  templateUrl: './phone-list.component.html',
  styleUrls: ['./phone-list.component.css']
})
export class PhoneListComponent implements OnInit {

  constructor(private phoneService: PhoneService) { }

  phones: Phone[];
  query: string;
  orderProp: string;

  ngOnInit() {
    this.orderProp = 'age';
    this.getHeroes();
  }

  getHeroes(): void {
    this.phoneService.getPhones()
    .subscribe(phones => this.phones = phones);
  }

}
