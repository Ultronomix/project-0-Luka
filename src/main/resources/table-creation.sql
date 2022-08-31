CREATE TABLE app_users (
  id uuid PRIMARY KEY DEFAULT gen_random_uuid(),
  user_name varchar NOT NULL,
  paycheck INT NOT NULL
);

CREATE TABLE bills (
  user_id uuid PRIMARY KEY DEFAULT gen_random_uuid(),
  bill_name varchar NOT NULL,
  bill_amount INT NOT NULL,
  FOREIGN KEY (user_id) REFERENCES app_users (id)
);


