package com.example.springdemo.dto;

import lombok.Value;

import jakarta.validation.constraints.*;

/**
 * Attempt coming from the user
 * data transfer object
 */
@Value
public class ChallengeAttemptDTO {

    @Min(1) @Max(99)
    int factorA, factorB;
    @NotBlank
    String userAlias;
    @Positive(message = "How could you possibly get a negative result here? Try again.")
    int guess;

}