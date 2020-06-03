package com.company.dummy.datatype;

import com.haulmont.chile.core.annotations.JavaClass;
import com.haulmont.chile.core.datatypes.Datatype;
import org.apache.commons.lang3.StringUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

@JavaClass(java.sql.Date.class)
public class CustomDateDataType implements Datatype<Date> {

    private static final String PATTERN = "dd:MM:yyyy";

    @Override
    public String format(Object value) {
        if (value == null) {
            return "";
        }

        DateFormat format;
        format = new SimpleDateFormat(PATTERN);
        return format.format((value));
    }

    @Override
    public String format(Object value, Locale locale) {
        if (value == null) {
            return "";
        }

        DateFormat format;
        format = new SimpleDateFormat(PATTERN);
        return format.format((value));
    }

    protected java.sql.Date normalize(java.util.Date dateTime) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(dateTime);
        return new java.sql.Date(cal.getTime().getYear(), cal.getTime().getMonth(), cal.getTime().getDay());
    }

    @Override
    public Date parse(String value) throws ParseException {
        if (StringUtils.isBlank(value)) {
            return null;
        }

        DateFormat format;
        format = new SimpleDateFormat(PATTERN);
        format.setLenient(false);
        return normalize(format.parse(value.trim()));
    }

    @Override
    public Date parse(String value, Locale locale) throws ParseException {
        if (StringUtils.isBlank(value)) {
            return null;
        }
        DateFormat format;
        format = new SimpleDateFormat(PATTERN);
        format.setLenient(false);
        return normalize(format.parse(value.trim()));
    }
}