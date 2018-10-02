import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { AvesComponent } from './aves/aves.component';
import { HttpClientModule } from '@angular/common/http';
import { AveService } from './aves/ave.service';
import { CrudComponent } from './aves/crud.component';
import { FormsModule } from '@angular/forms';
import { RouterModule, Routes} from '@angular/router';
import { ZonasComponent } from './zonas/zonas.component';

const routes: Routes = [
  {path: '',redirectTo:'/aves', pathMatch: 'full'},
  {path: 'aves', component: AvesComponent},
  {path: 'aves/crud', component: CrudComponent},
  {path: 'aves/crud/:cdave', component: CrudComponent}
];


@NgModule({
  declarations: [
    AppComponent,
    AvesComponent,
    CrudComponent,
    ZonasComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    RouterModule.forRoot(routes)
  ],
  providers: [
    AveService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
