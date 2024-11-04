package com.smartdeltasystems.common;

public interface Urls {

    String API = "api";
    String SERVICE_NAME = "smartdeltasystems";
    String ROOT = "/" + API + "/" + SERVICE_NAME;

    interface Student {
        String PART = "student";
        String FULL = ROOT + "/" + PART;

        interface GetStudentList {
            String PART = "getStudentList";
            String FULL = Student.FULL + "/" + PART;
        }

        interface StudentId {
            String PART = "{studentId}";
            String FULL = Student.FULL + "/" + PART;

            interface PostStudent {
                String PART = "postStudent";
                String FULL = StudentId.FULL + "/" + PART;
            }

            interface DeleteStudent {
                String PART = "deleteStudent";
                String FULL = StudentId.FULL + "/" + PART;
            }
        }

        interface PutStudent {
            String PART = "putStudent";
            String FULL = Student.FULL + "/" + PART;
        }


    }

    interface Token {
        String PART = "token";
        String FULL = ROOT + "/" + PART;

        interface GetToken {
            String PART = "getToken";
            String FULL = Student.FULL + "/" + PART;
        }
    }
}
