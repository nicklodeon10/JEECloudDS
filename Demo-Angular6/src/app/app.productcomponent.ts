import {Component} from '@angular/core';


@Component({
    selector: 'prod',
    templateUrl: 'app.add.html'
})

export class ProductComponent{ 

    prodId: number= 1001;
    prodName: string="Mobile";
    prodOnline: boolean;
    prodType: any="true";
    
    getAllData():any{
        
    }

}