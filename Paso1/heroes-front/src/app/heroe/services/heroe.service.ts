import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { inject } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class HeroeService {

  httpClient = inject(HttpClient);
  private baseUrl = 'http://localhost:8001/api';

  constructor() { }

  getCharacters(): Observable<any> {
    return this.httpClient.get(this.baseUrl+"/v1/public/characters");
  }

  getCharacterDetail(id: number): Observable<any> {
    return this.httpClient.get(this.baseUrl+"/v1/public/characters/"+id);
  }
}
