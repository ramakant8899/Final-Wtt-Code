package com.coursemanagesystem.exceptions;



import javax.management.RuntimeErrorException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.coursemanagesystem.apiresponce.ApiResponce;

@RestControllerAdvice
public class GlobalExceptionHandler 
{
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponce> resourceNotFoundExceptionHandler(ResourceNotFoundException ex)
	{
		String message = ex.getMessage();
		ApiResponce apiResp= new ApiResponce(message, false);
		return new ResponseEntity<ApiResponce>(apiResp, HttpStatus.NOT_FOUND);
		
	}

	/*
	 * @ExceptionHandler(MethodArgumentNotValidException.class) public
	 * ResponseEntity<Map<String, String>>
	 * handleMethodArgsNotValidException(MethodArgumentNotValidException ex) {
	 * Map<String, String> resp= new HashMap<>();
	 * ex.getBindingResult().getAllErrors().forEach((error) -> { String
	 * fieldName=((FieldError) error).getField(); String message=
	 * error.getDefaultMessage(); resp.put(fieldName, message); }); return new
	 * ResponseEntity<Map<String, String>>(resp, HttpStatus.BAD_REQUEST); }
	 */
	@ExceptionHandler(RuntimeErrorException.class)
	public ResponseEntity<ApiResponce> handleRuntimeErrorException(RuntimeErrorException ex)
	{
		String message = ex.getMessage();
		ApiResponce apiResp= new ApiResponce(message, false);
		return new ResponseEntity<ApiResponce>(apiResp, HttpStatus.BAD_REQUEST);	
	}
	
	@ExceptionHandler(value = DuplicateEntryExistException.class)
    public final ResponseEntity<String> handleUpdateFailException(DuplicateEntryExistException exception)
	{
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
    }
	
	
}
