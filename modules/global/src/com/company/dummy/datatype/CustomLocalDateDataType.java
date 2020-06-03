package com.company.dummy.datatype;

import com.haulmont.chile.core.annotations.Ddl;
import com.haulmont.chile.core.annotations.JavaClass;
import com.haulmont.chile.core.datatypes.FormatStrings;
import com.haulmont.chile.core.datatypes.impl.AbstractTemporalDatatype;
import org.apache.commons.lang3.StringUtils;
import org.dom4j.Element;

import javax.annotation.Nullable;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalQuery;
import java.util.Locale;

@Ddl("date")
@Ddl(dbms = "mssql", value = "datetime")
@Ddl(dbms = "mssql-2012", value = "datetime2")
@JavaClass(LocalDate.class)
public class CustomLocalDateDataType extends AbstractTemporalDatatype<LocalDate> {

    private static final String PATTERN = "dd:MM:yyyy";

    public CustomLocalDateDataType(Element element) {
        super(element);
    }

    @Override
    public String format(Object value) {
        if (value == null) {
            return "";
        } else {
            DateTimeFormatter formatter;
                formatter = DateTimeFormatter.ofPattern(PATTERN);

            return formatter.format((LocalDate) value);
        }
    }

    @Override
    public String format(@Nullable Object value, Locale locale) {
        if (value == null) {
            return "";
        }
        DateTimeFormatter formatter;
        formatter = DateTimeFormatter.ofPattern(PATTERN);

        return formatter.format((LocalDate) value);
    }

    @Nullable
    @Override
    public LocalDate parse(@Nullable String value) throws ParseException {
        if (StringUtils.isBlank(value)) {
            return null;
        }

        DateTimeFormatter formatter;
        formatter = DateTimeFormatter.ofPattern(PATTERN);

        try {
            return formatter.parse(value.trim(), newInstance());
        } catch (DateTimeParseException ex) {
            throw new ParseException(ex.getMessage(), 0);
        }
    }

    @Nullable
    @Override
    public LocalDate parse(@Nullable String value, Locale locale) throws ParseException {
        if (StringUtils.isBlank(value)) {
            return null;
        }

        DateTimeFormatter formatter;
        formatter = DateTimeFormatter.ofPattern(PATTERN);

        try {
            return formatter.parse(value.trim(), newInstance());
        } catch (DateTimeParseException ex) {
            throw new ParseException(ex.getMessage(), 0);
        }
    }

    @Override
    protected DateTimeFormatter getDateTimeFormatter() {
        return DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
    }

    @Override
    protected DateTimeFormatter getDateTimeFormatter(FormatStrings formatStrings, Locale locale) {
        return DateTimeFormatter.ofPattern(PATTERN, locale);
    }

    @Override
    protected TemporalQuery<LocalDate> newInstance() {
        return LocalDate::from;
    }
}