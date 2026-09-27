import mysql.connector

connection = mysql.connector.connect(
    host="localhost",
    user="root",
    password = "raj123",
    database = "puru"
)


try:
    with connection.cursor() as cursor:
        create_query =""" CREATE TABLE IF NOT EXISTS employee(
        id INT  AUTO_INCREMENT PRIMARY KEY,
        name VARCHAR(100),
        department VARCHAR(100));"""

        cursor.execute(create_query)


        insert_query = "INSERT INTO employee(name, department) VALUES (%s, %s)"
        values = [("Naren", "IT"), ("Ganesh", "Law")]

        cursor.executemany(insert_query, values)

        connection.commit()

        select_query = "SELECT * FROM employee"
        cursor.execute(select_query)

        result = cursor.fetchall()


        for row in result:
            print(row)
finally:
    connection.close()

