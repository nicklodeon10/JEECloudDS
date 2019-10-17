import {Component} from '@angular/core'

@Component({
    selector: "show",
    templateUrl: "app.showcar.html"
})

export class ShowCar{
    
    pic: string="";
    value:any;

    showImage(event:any):any{
        this.value=event.target.value;
        if(this.value=="bmw"){
            this.pic="../assets/bmw.jpg";
        }else if(this.value=="audi"){
            this.pic="../assets/audi.jpg";
        }else if(this.value=="mercedes"){
            this.pic="../assets/mercedes.jpg";
        }else if(this.value=="bugatti"){
            this.pic="../assets/bugatti.jpg";
        }
    }

}