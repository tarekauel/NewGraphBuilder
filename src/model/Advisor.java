package model;

import java.lang.reflect.Field;
import java.util.Objects;

/**
 * @author Tarek Auel
 * @since Februar 01, 2015.
 */
public class Advisor extends TeamMember {

    public String type = "Advisor";

    @Override
    public String getRelType() {
        return "hasBoardMemberAndAdvisor";
    }
}
