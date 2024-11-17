package org.example.sql.A092OverallAcceptance;

public class A092Exercise {
    public static final String SQL_QUERY =
    "Select round(IFNULL(Count(ra.requester_id)) / count(fr.sender_id),0),2) as accept_rate from friend_request fr left join request_accepted ra on fr.sender_id = ra.requester_id AND fr.send_to_id = ra.accepter_id;";
}
