# Laboratorio - Diagramas de Clase
## Generar las clases a partir de un diagrama de clases.

### Prerequisitos

#### GitHub Tokens
- [Receta para generar tokens y usarlos para hacer push a archivos](https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/creating-a-personal-access-token)

### Practica en solo

1. Generar el codigo fuente del siguiente diagrama de clases
![Order System](/images/diagrama-clase-01.PNG "Diagrama de clases inicial")
2. [Generar Pull request a repositorio principal](https://github.com/JoeStark37/class-diagram-lab)
3. Revisar y aprobar cambios
4. Hacer merge del pull request
5. Que los demas actualicen sus repositorios con los que se acaban de integrar en el repositorio principal
    - Crear pull requests de master (repositorio princial) a los repositorios forkeados.

### Practica en colaboracion

1. Generar el codigo fuente a partir del siguiente diagrama de clases, en esta ocasión los tres colabolaremos para generar todo el modelo de clases.
![Library system](/images/diagrama-clase-02.png "Diagrama de clase biblioteca")
2. [JoeStark37](https://github.com/JoeStark37/class-diagram-lab) implementará
    - Book
    - Author
    - Language
    - Format
3. [oscarito49](https://github.com/oscarito49/class-diagram-lab)
    - BookItem
    - Account
    - Library
    - AccountState
4. [El pitudo](https://github.com/Laboratorios-Gigabyte/class-diagram-lab?organization=Laboratorios-Gigabyte&organization=Laboratorios-Gigabyte)
    - Patron
    - Librarian
    - Library
5. Toda la Banda, implementar el sistema de búsqueda del sistema para biblioteca