package com.cybertek.services;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

    @Value("${instructor}")
    private String instructorName;

    private ExtraSessions extraSessions;

    public Java(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    @Override
    public int getTeachingHours() {
        return 20 + extraSessions.getHours();
    }

    @Override
    public String toString() {
        return "Java{" +
                "instructorName='" + instructorName + '\'' +
                '}';
    }
}
