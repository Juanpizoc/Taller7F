# Taller7F

## Taller Numero 5: Procedimientos y funciones

## crear tabla

```sql
CREATE TABLE Taller_Cuatro (
    Id_Taller_Cuatro NUMBER(9) PRIMARY KEY,
    Usuario VARCHAR2(55),
    Contrasena VARCHAR2(55)
);

```



## Crear funcion para validar contraseña y agregar

```sql
CREATE SEQUENCE Taller_Cuatro_seq

CREATE OR REPLACE FUNCTION validar_contrasena(p_usuario VARCHAR2, p_contrasena VARCHAR2) RETURN NUMBER IS
BEGIN
    IF LENGTH(p_contrasena) BETWEEN 13 AND 20 AND
       REGEXP_LIKE(p_contrasena, '.*[a-z].*') AND
       REGEXP_LIKE(p_contrasena, '.*[A-Z].*') AND
       REGEXP_LIKE(p_contrasena, '.*\d.*') AND
       REGEXP_LIKE(p_contrasena, '[^a-zA-Z0-9]') THEN
        INSERT INTO Taller_Cuatro (Id_Taller_Cuatro, Usuario, Contrasena)
        VALUES (Taller_Cuatro_seq.NEXTVAL, p_usuario, p_contrasena);
        
        RETURN 1; -- Cambiar a 1 para indicar éxito
    ELSE
        RETURN 0; -- Cambiar a 0 para indicar fracaso
    END IF;
END;
/

```

## procedimiento almacenado para devoler informacion de la tabla

```sql
CREATE OR REPLACE FUNCTION obtener_usuarios_func 
RETURN SYS_REFCURSOR 
IS
    p_cursor SYS_REFCURSOR;
BEGIN
    OPEN p_cursor FOR SELECT * FROM Taller_Cuatro;
    RETURN p_cursor;
END;
/

```

## consulta para comprobar que si se agregaban regitros a la base.
```sql
SELECT * FROM Taller_Cuatro;
```



## ruta prueba postman

```sql

http://localhost:8080/taller-cuatro/validar?usuario=juanpizo&contrasena=MyP@ssword110!

# ruta para validarcontraseña

```

