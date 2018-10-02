import { Component, OnInit } from '@angular/core';
import { Ave } from './ave';
import { AveService } from './ave.service';
import { Router,ActivatedRoute} from '@angular/router';

@Component({
  selector: 'app-crud',
  templateUrl: './crud.component.html'
})
export class CrudComponent implements OnInit {

  private ave: Ave = new Ave();
  private titulo:string = "Crear Ave!";



  constructor(
    private aveService: AveService,
    private router: Router,
    private activatedRoute: ActivatedRoute) { }

  ngOnInit() {
    this.cargarAve();
  }

  cargarAve(): void{
    this.activatedRoute.params.subscribe(params => {
      let cdave = params['cdave']
      if(cdave){
        this.aveService.getAve(cdave).subscribe((ave) => this.ave = ave)
      }
      })
  }

  public create(): void{
    this.aveService.create(this.ave).subscribe(response => this.router.navigate(['/aves']));
  }

  update(): void{
    this.aveService.update(this.ave).subscribe(ave => {this.router.navigate(['/aves'])});
  }



}
