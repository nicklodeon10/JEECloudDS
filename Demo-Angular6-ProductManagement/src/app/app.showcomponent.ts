import {Component, OnInit} from '@angular/core';
import {ProductService} from './_service/app.productservice';
import {Product} from './_model/app.product'

@Component({
    selector: 'show',
    templateUrl: 'app.show.html'
})

export class ShowComponent implements OnInit{
    
    // prodId:number;
    // prodName:string;
    // prodCost:number;
    // currProduct:any;
    // currIndex:any;
    // flag:boolean=false;

    products:Product[]=[];

    constructor(private service:ProductService){}       

    ngOnInit(){
        this.service.getAllData().subscribe((data:Product[])=>this.products=data);
    }

    deleteProduct(id: any):any{
        this.service.deleteProduct(id).subscribe();
    }

    // searchProduct(product: any):any{
    //     this.currProduct={prodId: product.prodId, prodName: product.prodName, prodCost: product.prodCost};;
    //     this.flag=true;
    // }

    // updateProduct(){
    //     for(let i=0; i<this.products.length; i++){
    //         if(this.products[i].prodId==this.currProduct.prodId){
    //             this.products[i]=this.currProduct;
    //             break; 
    //         }
    //     }
    //     this.flag=false;
    // }

}