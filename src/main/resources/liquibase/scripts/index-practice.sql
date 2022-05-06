-- liquibase formatted sql

-- changeset dkondaurov:1

CREATE INDEX student_name ON student (name);

-- changeset dkondaurov:2
CREATE INDEX faculty_name_and_color ON faculty (name, color);
