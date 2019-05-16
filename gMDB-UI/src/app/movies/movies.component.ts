import { Component, OnInit } from '@angular/core';
import { Movies } from './movies';
import { data } from './data'

@Component({
  // selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.css']
})
export class MoviesComponent implements OnInit {

  Movies: any[];
  constructor() {
  }


  public ngOnInit() {
      
    this.Movies = data;

  }

}
