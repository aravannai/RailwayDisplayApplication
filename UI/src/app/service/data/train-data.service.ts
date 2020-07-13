import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { TrainDetails } from 'src/app/railway-dashboard/railway-dashboard.component';
import { API_URL } from 'src/app/app.constants';

@Injectable({
  providedIn: 'root'
})
export class TrainDataService {

  constructor(private http: HttpClient) { }

  retrieveAllTrains(){
    return this.http.get<TrainDetails[]>(`${API_URL}/api/listAllTrains`)
  }

  // deleteTodos(userName, id){
  //   return this.http.delete(`${TODO_JPA_API_URL}/users/${userName}/todos/${id}`)
  // }

  // updateTodo(userName, id, todo){
  //   return this.http.
  //         put<Todo>(`${TODO_JPA_API_URL}/users/${userName}/todos/${id}`, todo)
  // }

  retrieveTrainByNumber(trainNumber){
    return this.http.get<TrainDetails>(`${API_URL}/api/searchByTrainNumber/${trainNumber}`)
  }

  retrieveTrainByName(trainName){
    return this.http.get<TrainDetails>(`${API_URL}/api/searchByTrainNumber/${trainName}`)
  }

  // createTodo(userName, todo){
  //   console.log(userName)
  //   return this.http.post(`${TODO_JPA_API_URL}/users/${userName}/todos`, todo)
  // }
}
