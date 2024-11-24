package org.example.sql.A093SeatAvailable;

/*
*
-- Define the structure of your Seats table.
CREATE TABLE Seats (
    seat_id INT PRIMARY KEY,
    available BOOLEAN
);
* */

public class A093SeatAvailable {


    public static final String SQL_QUERY =
            "" +
                    "    SELECT s1.seat_id \n" +
                    "    FROM Seats s1, Seats s2 \n" +
                    "    WHERE s1.available = 1 AND s2.available = 1 \n" +
                    "    AND ABS(s1.seat_id - s2.seat_id) = 1 \n" +
                    "    ORDER BY s1.seat_id;"+
                    "";

}
