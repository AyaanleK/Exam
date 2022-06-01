# BilAPP

Database til Bil Abonnement. 

2 Semester Eksamens opgave. 

Lavet af:
- Dannie Kattrup. GitHub: http://github.com/Danjie3000
- Mikkel Nielsen. GitHub:
- Ayaanle Hassan. GitHub:
___________________________________________________________________

Opsætning af java/html/css:
1. Hent GitHub projektet fra dette link: https://github.com/Danjie3000/BilAPP.git
2. Åben IntelliJ og tryk på "File". Derefter vælg "New" og tryk på "Project from version control..." og derefter indsæt linket du har kopiret fra GitHub.
Så tryk "clone".

Opsætning af database:
1. Inde i MySQL skal du trykke på "Create new schema" og navngive det exam_car. Defter tryk "Apply" og "Apply" igen. 
2. Efter det skal du åbne den vedlagte MySQL fil og trykke "Apply".

Tilkobling mellem IntelliJ og MySQL lokalt:
1. Inde i IntelliJ skal du trykke på "View" oppe i navigationsbaren øverst til venstre. Derefter vælges "Tool windows" og så klik på "databases" med tilhørende ikon.
Dette vil åbne en menu i højre side af skærmen.
2. I den nye menu skal man trykke på "+" ikonet og vælge "Data Source". Inde i denne fane vil muligheden være for at vælge MySQL. 
Hvis de nødvendige drivers ikke er installeret, skal man vente 2 minutters tid til de er hentet.
3.Følgende vil der hoppe en menu frem som hedder "Data Sources and Drivers". Den skal bare udfyldes med de oplysninger i har valgt internt, dog skal databasen link være under den form som hedder "Database:"

Inde under "spring.datasource.username =" og "spring.datasource.password =" skal der selvfølgelige tilføjes det username og password i selv har lavet.

4. Efter det skal du kopier følgende:
   spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
   spring.datasource.url=jdbc:mysql://localhost:3306/exam_car
   spring.datasource.username = user
   spring.datasource.password = ********
   spring.jdbc.show-sql=true
   server.port=9090


