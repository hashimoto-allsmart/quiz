package com.allsmart.quiz.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RightToAnswer {
	/** チームID */
	String teamId;
	/** チーム名 */
	String teamName;
}
