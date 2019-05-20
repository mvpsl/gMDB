import { Component } from '@angular/core';
import { UseExistingWebDriver } from 'protractor/built/driverProviders';
import { User } from './user';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'gMDB-UI';
  currentuser: User = null;
}
