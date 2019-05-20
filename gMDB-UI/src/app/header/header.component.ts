import { Component, OnInit, Input } from '@angular/core';
import { User } from '../user';

@Component({
  selector: 'header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
  // @Input() currentuser: User;
  constructor() { }

  ngOnInit() {
  }

}
