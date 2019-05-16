import { Component, OnInit } from '@angular/core';
import { Movies } from './movies';
import { data } from './data';
import {Router} from '@angular/router';

@Component({
  // selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.css']
})
export class MoviesComponent implements OnInit {

  Movies: any[];
  constructor(private router: Router) {
  }


  public ngOnInit() {
      
    this.Movies = data;

  }



}
