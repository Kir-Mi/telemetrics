DROP TABLE IF EXISTS simcards CASCADE;
DROP TABLE IF EXISTS regions CASCADE;
DROP TABLE IF EXISTS operators CASCADE;
DROP TABLE IF EXISTS managers CASCADE;
DROP TABLE IF EXISTS agents CASCADE;
DROP TABLE IF EXISTS expenses CASCADE;

CREATE TABLE simcards (
  simcard_id integer PRIMARY KEY,
  icc integer,
  phone_mumber integer,
  agent_id integer,
  region_id integer,
  operator_id integer,
  date_received_by_dealer date,
  date_received_by_agent date,
  date_of_activation date
);

CREATE TABLE IF NOT EXISTS regions (
  region_id integer PRIMARY KEY,
  name varchar
);

CREATE TABLE IF NOT EXISTS operators (
  operator_id integer PRIMARY KEY,
  name varchar
);

CREATE TABLE IF NOT EXISTS managers (
  manager_id integer PRIMARY KEY,
  name varchar,
  phone_number integer
);

CREATE TABLE IF NOT EXISTS agents (
  agent_id integer PRIMARY KEY,
  name varchar,
  phone_number integer,
  manager_id integer,
  FOREIGN KEY (manager_id) REFERENCES managers (manager_id)
);

CREATE TABLE IF NOT EXISTS expenses (
  expense_id integer PRIMARY KEY,
  simcard_id integer,
  month_date date,
  amount decimal,
  FOREIGN KEY (simcard_id) REFERENCES simcards (simcard_id)
);

ALTER TABLE simcards ADD FOREIGN KEY (agent_id) REFERENCES agents (agent_id);
ALTER TABLE simcards ADD FOREIGN KEY (region_id) REFERENCES regions (region_id);
ALTER TABLE simcards ADD FOREIGN KEY (operator_id) REFERENCES operators (operator_id);
