package com.progresee.app.utils;


import com.progresee.app.beans.Classroom;
import com.progresee.app.beans.Exercise;
import com.progresee.app.beans.Task;
import com.progresee.app.beans.User;

public class NullCheckerUtils {

	public static boolean userNullChecker(User user) {
		if (user.getEmail() != null && user.getFullName() != null) {
			if (user.getEmail().trim() != "" && user.getFullName().trim() != "") {
				return true;
			}
		}
		return false;
	}

	public static boolean taskNullChecker(Task task) {
		if (task.getTitle() != null && task.getDescription() != null && task.getEndDate() != null) {
			if (task.getTitle().trim() != "" && task.getDescription() != "") {
				return true;
			}
		}
		return false;
	}

	public static boolean exerciseNullChecker(Exercise exercise) {
		if (exercise.getEx() != null && exercise.getEx() != "") {
			return true;
		}
		return false;
	}

	public static boolean classroomNullChecker(Classroom classroom) {
		if (classroom.getName() != null && classroom.getId() != 0 && classroom.getOwner() != null) {
			if (classroom.getName().trim() != "" && classroom.getOwner().trim() != "") {
				return true;
			}
		}
		return false;
	}

}