package org.modelmap.core;


import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Stream;

/**
 * {@code FieldModel} implementation based on {@code java.util.Map}
 */
public class BaseFieldModel implements FieldModel {

    private final Map<FieldId, Object> values;
    private final FieldInfo[] fieldInfos;

    public BaseFieldModel(FieldInfo... fieldInfos) {
        this(new HashMap<>(), fieldInfos);
    }

    public BaseFieldModel(Map<FieldId, Object> values, FieldInfo... fieldInfos) {
        this.values = values;
        this.fieldInfos = fieldInfos;
    }

    public BaseFieldModel(FieldModel fieldModel) {
        this(fieldModel.getFieldInfos());
        setAll(fieldModel);
    }

    public Map<FieldId, Object> asMap() {
        return new HashMap<>(values);
    }

    @Override
    public FieldInfo[] getFieldInfos() {
        return fieldInfos;
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T> T get(FieldId fieldId) {
        return (T) values.get(fieldId);
    }

    @Override
    public void set(FieldId fieldId, Object value) {
        values.put(fieldId, value);
        Arrays.stream(siblingsOf(fieldId)).forEach(s -> values.put(s, value));
    }


    private static final FieldId[] NO_SIBLINGS = new FieldId[] {};

    private FieldId[] siblingsOf(FieldId fieldId) {
        Optional<FieldInfo> sublings = Arrays.stream(fieldInfos).filter(info -> info.id() == fieldId).findFirst();
        return sublings.isPresent() ? sublings.get().siblings() : NO_SIBLINGS;
    }

    @Override
    public Iterator<Entry<FieldId, Object>> iterator() {
        return values.entrySet().iterator();
    }

    @Override
    public Spliterator<Entry<FieldId, Object>> spliterator() {
        return new HashSet<>(values.entrySet()).spliterator();
    }

    @Override
    public Stream<Entry<FieldId, Object>> stream() {
        return new HashSet<>(values.entrySet()).stream();
    }

    @Override
    public Stream<Entry<FieldId, Object>> parallelStream() {
        return new HashSet<>(values.entrySet()).parallelStream();
    }
}

class example{
  public static void main (String args[]) {
    int num1 = 15;
    //i for rows and j for columns      
    //row denotes the number of rows you want to print  
    int i, j, row=6;   
    //outer loop for rows  
    for(i=0; i<row; i++)   
    {   
    //inner loop for columns  
    for(j=0; j<=i; j++)   
    {   
    //prints stars   
    System.out.print("* ");   
    }   
    //throws the cursor in a new line after printing each line  
    System.out.println();   
    }   
    }
    int num2 = 0;
    int row, i, j, space = 1;  
    Scanner sc = new Scanner(System.in);{
    row = sc.nextInt();  
    space = row - 1;  
    for (j = 1; j<= row; j++)  
    {  
    for (i = 1; i<= space; i++)  
    {  
    System.out.print(" ");  
    }  
    space--;  
    for (i = 1; i <= 2 * j - 1; i++)  
    {  
    System.out.print("*");  
    }  
    System.out.println("");  
    }  
    space = 1;  
    for (j = 1; j<= row - 1; j++)  
    {  
    for (i = 1; i<= space; i++)  
    {  
    System.out.print(" ");  
    }  
    space++;  
    for (i = 1; i<= 2 * (row - j) - 1; i++)  
    {  
    System.out.print("*");  
    }  
    System.out.println("");  
    }  
    result = num1/num2;
    System.out.println("The result is" +result);
    }
}

