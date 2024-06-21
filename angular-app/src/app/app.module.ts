import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { ContactComponent } from './contact/contact.component';
import {OurWorkComponent} from "./our-work/our-work.component";
import {GetInvolvedComponent} from "./get-involved/get-involved.component";
import {DocumentsComponent} from "./documents/documents.component";

@NgModule({
    declarations: [
        HeaderComponent,
        HomeComponent,
    ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        AppComponent,
        AboutComponent,
        ContactComponent,
        DocumentsComponent
    ],
    providers: [],
  exports: [
  ],
    bootstrap: [AppComponent]
})
export class AppModule { }
