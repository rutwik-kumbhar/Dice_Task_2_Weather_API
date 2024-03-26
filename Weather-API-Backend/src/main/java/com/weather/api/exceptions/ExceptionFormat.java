package com.weather.api.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionFormat {
    private LocalDateTime timestamp;
    private String message;
    private String uri;
}
