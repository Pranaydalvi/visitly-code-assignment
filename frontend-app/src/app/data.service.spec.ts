import { TestBed } from '@angular/core/testing';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import { DataService } from './data.service';

describe('DataService', () => {
  let service: DataService;
  let httpMock: HttpTestingController;
  const mockData = [{ title: 'Test Title', description: 'Test Description' }];

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [HttpClientTestingModule],
      providers: [DataService]
    });

    service = TestBed.inject(DataService);
    httpMock = TestBed.inject(HttpTestingController);
  });

  it('should fetch data successfully', () => {
    service.getData().subscribe(data => {
      expect(data).toEqual(mockData);
    });

    const req = httpMock.expectOne('http://localhost:8983/api/user/');
    expect(req.request.method).toBe('GET');
    req.flush(mockData);
  });

  it('should handle errors correctly', () => {
    service.getData().subscribe(
      () => {},
      (error) => {
        expect(error).toBeTruthy();
      }
    );

    const req = httpMock.expectOne('http://localhost:8983/api/user/allusers');
    req.flush('Error', { status: 500, statusText: 'Server Error' });
  });

  afterEach(() => {
    httpMock.verify();
  });
});
