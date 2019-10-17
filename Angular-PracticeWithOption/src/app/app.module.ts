import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent }  from './app.component';
import {ShowCar} from './app.showcarcomponent'

@NgModule({
    imports: [
        BrowserModule
    ],
    declarations: [
        AppComponent,
        ShowCar
		],
    providers: [ ],
    bootstrap: [AppComponent]
})

export class AppModule { }