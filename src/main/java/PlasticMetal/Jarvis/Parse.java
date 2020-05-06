package PlasticMetal.Jarvis;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Parse
{
    /**
     * try to parse a number
     * @param expression number expression
     * @return try result
     */
    public static TryResult<Byte> TryParseByte(String expression)
    {
        try
        {
            return new TryResult<>(Byte.parseByte(expression));
        }
        catch (NumberFormatException e)
        {
            return new TryResult<>();
        }
    }
    /**
     * try to parse a number
     * @param expression number expression
     * @return try result
     */
    public static TryResult<Integer> TryParseInt(String expression)
    {
        try
        {
            return new TryResult<>(Integer.parseInt(expression));
        }
        catch (NumberFormatException e)
        {
            return new TryResult<>();
        }
    }
    /**
     * try to parse a number
     * @param expression number expression
     * @return try result
     */
    public static TryResult<Long> TryParseLong(String expression)
    {
        try
        {
            return new TryResult<>(Long.parseLong(expression));
        }
        catch (NumberFormatException e)
        {
            return new TryResult<>();
        }
    }
    /**
     * try to parse a number
     * @param expression number expression
     * @return try result
     */
    public static TryResult<Short> TryParseShort(String expression)
    {
        try
        {
            return new TryResult<>(Short.parseShort(expression));
        }
        catch (NumberFormatException e)
        {
            return new TryResult<>();
        }
    }

    /**
     * try to parse a number
     * @param expression number expression
     * @return try result
     */
    public static TryResult<Double> TryParseDouble(String expression)
    {
        try
        {
            return new TryResult<>(Double.parseDouble(expression));
        }
        catch (NumberFormatException e)
        {
            return new TryResult<>();
        }
    }

    /**
     * try to parse a number
     * @param expression number expression
     * @return try result
     */
    public static TryResult<Float> TryParseFloat(String expression)
    {
        try
        {
            return new TryResult<>(Float.parseFloat(expression));
        }
        catch (NumberFormatException e)
        {
            return new TryResult<>();
            
        }
    }

    /**
     * try to parse a boolean
     * @param expression boolean expression
     * @return try result
     */
    public static TryResult<Boolean> TryParseBoolean(String expression)
    {
        try
        {
            return new TryResult<>(Boolean.parseBoolean(expression));
        }
        catch (NumberFormatException e)
        {
            return new TryResult<>();
        }
    }

    /**
     * try to parse a time
     * @param expression time expression
     * @param formatter the formatter
     * @return try result
     */
    public static TryResult<LocalTime> TryParseLocalTime(String expression, DateTimeFormatter formatter)
    {
        try
        {
            return new TryResult<>(LocalTime.parse(expression, formatter));
        }
        catch (NumberFormatException e)
        {
            return new TryResult<>();
        }
    }

    /**
     * try to parse a date
     * @param expression date expression
     * @param formatter the formatter
     * @return try result
     */
    public static TryResult<LocalDate> TryParseLocalDate(String expression, DateTimeFormatter formatter)
    {
        try
        {
            return new TryResult<>(LocalDate.parse(expression, formatter));
        }
        catch (NumberFormatException e)
        {
            return new TryResult<>();
        }
    }

    /**
     * try to parse a datetime
     * @param expression datetime expression
     * @param formatter the formatter
     * @return try result
     */
    public static TryResult<LocalDateTime> TryParseLocalDateTime(String expression, DateTimeFormatter formatter)
    {
        try
        {
            return new TryResult<>(LocalDateTime.parse(expression, formatter));
        }
        catch (NumberFormatException e)
        {
            return new TryResult<>();
        }
    }
    
}
