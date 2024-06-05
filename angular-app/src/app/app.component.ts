import { Component } from '@angular/core';
import {RouterLink, RouterLinkActive, RouterOutlet} from '@angular/router';
import {AppModule} from "./app.module";
import {AboutComponent} from "./about/about.component";
import {ContactComponent} from "./contact/contact.component";
import {OurWorkComponent} from "./our-work/our-work.component";

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,
    RouterLink,
    OurWorkComponent, AboutComponent, ContactComponent, RouterLinkActive],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'CF';
  protected readonly OurWorkComponent = OurWorkComponent;
}
