import { Injectable } from '@angular/core';
import { data } from './data';
import { Movies } from './movies';

@Injectable({
  providedIn: 'root'
})
export class MoviesService {


  constructor() { }


  getMovieByID(id: number): Movies {
    let movie;
   for(let i=0; i<data.length;i++){   
     if(data[i].movie_id == id){
        movie = data[i];
        console.log(data[i].movie_id);
     }  
   } 
    return movie;
  }

}
