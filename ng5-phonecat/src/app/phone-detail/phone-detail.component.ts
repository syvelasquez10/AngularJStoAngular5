import { Component, OnInit } from '@angular/core';
import { Phone } from '../model/Phone';
import { ActivatedRoute } from '@angular/router';
import { PhoneService } from '../phone.service';

import { Location } from '@angular/common';

@Component({
  selector: 'app-phone-detail',
  templateUrl: './phone-detail.component.html',
  styleUrls: ['./phone-detail.component.css']
})
export class PhoneDetailComponent implements OnInit {

  phone: Phone;
  mainImageUrl: string;

  constructor(private route: ActivatedRoute, private phoneService: PhoneService, private location: Location) { }

  ngOnInit() {
    const id = +this.route.snapshot.paramMap.get('id');
    this.phoneService.getPhone(id)
      .subscribe(phone => {
        this.phone = phone;
        this.setImage(phone.images[0]);
      });
  }

  setImage(image: string) {
    this.mainImageUrl = image;
  }

}
