-- 創建`details`表格
DROP TABLE IF EXISTS DETAILS;
CREATE TABLE DETAILS (
  DETAIL_ID BIGINT PRIMARY KEY AUTO_INCREMENT,
  TITLE VARCHAR(255)
);

-- 創建`item_detail`表格
DROP TABLE IF EXISTS ITEM_DETAIL;
CREATE TABLE ITEM_DETAIL (
  ITEM_ID BIGINT,
  DETAIL_ID BIGINT
);

-- 創建`items`表格
DROP TABLE IF EXISTS ITEMS;
CREATE TABLE ITEMS (
  ITEM_ID BIGINT PRIMARY KEY AUTO_INCREMENT,
  NAME VARCHAR(255),
  DESCRIPTION VARCHAR(255),
  IMAGE VARCHAR(2048),
  PRICE INT
);

ALTER TABLE ITEMS ALTER COLUMN ITEM_ID RESTART WITH 14; 

-- 創建`bills`表格
DROP TABLE IF EXISTS BILLS;
CREATE TABLE BILLS (
  BILL_ID BIGINT PRIMARY KEY AUTO_INCREMENT
);

-- 創建`orders`表格
DROP TABLE IF EXISTS ORDERS;
CREATE TABLE ORDERS (
  ORDER_ID BIGINT PRIMARY KEY AUTO_INCREMENT,
  ITEM_ID BIGINT,
  QUANTITY INT,
  ORDER_TIME TIMESTAMP
);

-- 創建`bill_order`表格，將訂單和帳單關聯起來
DROP TABLE IF EXISTS BILL_ORDER;
CREATE TABLE BILL_ORDER (
  BILL_ID BIGINT,
  ORDER_ID BIGINT,
  PRIMARY KEY (BILL_ID, ORDER_ID),
  FOREIGN KEY (BILL_ID) REFERENCES BILLS(BILL_ID),
  FOREIGN KEY (ORDER_ID) REFERENCES ORDERS(ORDER_ID)
);
