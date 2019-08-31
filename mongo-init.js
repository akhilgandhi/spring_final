db.createUser(
        {
            user: "app-root",
            pwd: "root123",
            roles: [
                {
                    role: "readWrite",
                    db: "userDb"
                }
            ]
        }
);