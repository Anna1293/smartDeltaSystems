
1. Запустить compose.yaml (Создает базу данных Mongo).
2. Заходим на http://localhost:8080/login
3. Выбираем способ логина Google/GitHub
4. После успешного логина осуществляется переход на страницу http://localhost:8080/swagger-ui/index.html#/
5. Используем контроллеры:

   5.1 GET /api/smartdeltasystems/token - возвращает токен текущего пользователя предоставленный провайдером.
   (http://localhost:8080/api/smartdeltasystems/token)

   5.2 GET /api/smartdeltasystems/student/getStudentList - возвращает список всех студентов в БД.
   (http://localhost:8080/api/smartdeltasystems/student/getStudentList)

   5.3 PUT /api/smartdeltasystems/student/putStudent - добавляет студента, в случае успеха возвращает идентификатор студента в БД.
   (http://localhost:8080/api/smartdeltasystems/student/putStudent + тело запроса)

   5.4 POST /api/smartdeltasystems/student/{studentId}/postStudent - изменяет студента.
   (/api/smartdeltasystems/student/<идентификатор студента>/postStudent + тело запроса)

   5.5. DELETE /api/smartdeltasystems/student/{studentId}/deleteStudent - удаляет студента из БД.
   (/api/smartdeltasystems/student/<идентификатор студента>/deleteStudent)
