import { Injectable} from '@angular/core';
import { Zona } from './zona';
import { Observable } from 'rxjs';
import { HttpClient ,HttpHeaders} from '@angular/common/http';



@Injectable()
export class ZonaService{

  private urlEndPoint:string = 'http://localhost:8080/app/zonas';

  constructor(private http: HttpClient){ }

  getZonas(): Observable<Zona[]> {
    return this.http.get<Zona[]>(this.urlEndPoint);
  }

}
