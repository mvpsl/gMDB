import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { SignUpComponent } from './sign-up/sign-up.component';
import { HomeComponent } from './home/home.component';
import { HttpClientModule } from '@angular/common/http';
import { HeaderComponent } from './header/header.component';
import { FormsModule } from '@angular/forms';
import { MoviesComponent } from './movies/movies.component';
import { ReviewComponent } from './review/review.component';
import { RouterModule, Routes } from '@angular/router';

import { BrowserAnimationsModule } from "@angular/platform-browser/animations";
import { 
	IgxAvatarModule,
	IgxButtonModule,
	IgxIconModule,
	IgxCardModule,
	IgxDividerModule,
	IgxRippleModule,
	IgxChipsModule,
	IgxSliderModule,
	IgxListModule,
	IgxExpansionPanelModule
 } from "igniteui-angular";
import { MovieDetailsComponent } from './movie-details/movie-details.component';
import { ReviewFormComponent } from './review-form/review-form.component';
import { UserComponent } from './user/user.component';
import { ForgotPwdComponent } from './forgot-pwd/forgot-pwd.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    SignUpComponent,
    HomeComponent,
    HeaderComponent,
    MoviesComponent,
    ReviewComponent,
    MovieDetailsComponent,
    ReviewFormComponent,
    UserComponent,
    ForgotPwdComponent,
    
    
  ],
  imports: [
    BrowserModule,
    ReactiveFormsModule,
    HttpClientModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    FormsModule,
    RouterModule
  
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
