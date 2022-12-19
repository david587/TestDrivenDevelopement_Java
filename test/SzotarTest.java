import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import models.FileHandler;

public class SzotarTest {
    ArrayList<String> methodNameList;
    @BeforeEach
    void setMethodList() {
        this.methodNameList = new ArrayList<>();
        //lekérjük a metodusokat
        Method[] methods = FileHandler.class.getDeclaredMethods();
        for(Method method : methods) {
            this.methodNameList.add(method.getName());
        }
    }
    @Test
    void checkReadFileMethod() {
        boolean hasReadFileMethod = this.methodNameList.contains("readFile");
        assertTrue(hasReadFileMethod);
    }

    ArrayList<String> fieldNameList;
    @BeforeEach
    void setFieldList() {
        this.fieldNameList = new ArrayList<>();
        //lekérjük a metodusokat
        Field[] fields = FileHandler.class.getDeclaredFields();
        for(Field field : fields) {
            this.fieldNameList.add(field.getName());
        }
    }

    //write test to this
    @Test
    void checkFileName(){
        boolean hasFileName = this.fieldNameList.contains("fileName");
        assertTrue(hasFileName, "Hiba! A fileName mező nem létezik");
    }
    @Test
    void checkFileNameContent(){
        //megvizsgáljuk a file nevét
        FileHandler fileHandler = new FileHandler();
        boolean isGoodName = fileHandler.fileName.equals("szotar.txt");

        assertTrue(isGoodName, "Hiba! A fájlnév nem szotar");
    }

}
