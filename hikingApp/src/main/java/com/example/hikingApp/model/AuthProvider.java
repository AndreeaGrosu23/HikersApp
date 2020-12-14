package com.example.hikingApp.model;

public enum AuthProvider {
    local,
    facebook,
    google,
    github
}

//best practice is to have enum types in capitals
//lower case chose because rest service that produces json prefers lowercase
//need to research this more in depth
//one option is to use capital in enum and convert later to lowercase in pojo user