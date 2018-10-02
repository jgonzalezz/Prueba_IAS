import { Injectable} from '@angular/core';
import { Ave } from './ave';
import { Observable } from 'rxjs';
import { HttpClient ,HttpHeaders} from '@angular/common/http';



@Injectable()
export class AveService{

  private urlEndPoint:string = 'http://localhost:8080/app/aves';
  private httpHeaders = new HttpHeaders({'Content-Type': 'application/json'});
  constructor(private http: HttpClient){ }


  getAves(): Observable<Ave[]> {
    return this.http.get<Ave[]>(this.urlEndPoint);
  }


  create(ave: Ave): Observable<Ave>{
    return this.http.post<Ave>(this.urlEndPoint,ave,{headers:this.httpHeaders});
  }

  getAve(cdave): Observable<Ave>{
    return this.http.get<Ave>(`${this.urlEndPoint}/${cdave}`);
  }

  update(ave: Ave): Observable<Ave>{
    return this.http.put<Ave>(`${this.urlEndPoint}/${ave.cdave}`,ave,{headers:this.httpHeaders});
  }

  delete(cdave: string): Observable<Ave>{
    return this.http.delete<Ave>(`${this.urlEndPoint}/${cdave}`,{headers:this.httpHeaders})
  }


}
