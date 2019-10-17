import {Component} from '@angular/core';


@Component({
    selector: 'prod',
    templateUrl: 'app.addproduct.html'
})

export class ProductComponent{ 

    prodId: number;
    prodName: string;
    prodOnline: boolean;
    prodType: any;
    pic: string="../assets/Angular.png";
    products:any=[{prodId:1001, prodName:'Mobile', prodOnline:true, prodType:"Electronics"},
    {prodId:1002, prodName:'AnotherMobile', prodOnline:true, prodType:"Electronics"},
    {prodId:1003, prodName:'AgainAnotherMobile', prodOnline:true, prodType:"Electronics"}
    ];

    getAllData():any{
        console.log(this.prodId+" "+this.prodName+" "+this.prodOnline+" "+this.prodType);
        alert("Event Occurred.\n"+this.prodId+" "+this.prodName+" "+this.prodOnline+" "+this.prodType);
    }

    deleteProduct(index: any):any{
        this.products.splice(index,1); 
    }

}