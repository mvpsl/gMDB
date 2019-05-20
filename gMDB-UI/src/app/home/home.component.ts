import { Component, OnInit } from '@angular/core';
import { data } from '../movies/data';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  movieSearch;
  movies = data;
  constructor() { }
  ngOnInit() {
  }
  

}
