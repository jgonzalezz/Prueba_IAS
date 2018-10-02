import { Component, OnInit } from '@angular/core';
import { Ave } from './ave';
import { AveService }  from './ave.service';

@Component({
  selector: 'app-aves',
  templateUrl: './aves.component.html'
})
export class AvesComponent implements OnInit {

  aves: Ave[];


  constructor(private aveService: AveService) { }

  ngOnInit() {
    this.aveService.getAves().subscribe( ave => this.aves = ave);
  }

  delete(ave: Ave): void{
    this.aveService.delete(ave.cdave).subscribe(response => {this.aves = this.aves.filter(a => a !== ave)})
  }

}
