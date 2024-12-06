-- 插入`details`表格數據
INSERT INTO details (detail_id, title) VALUES
(1, 'Italian'),
(2, 'Pineapple'),
(3, 'Ham'),
(4, 'Chicken'),
(5, 'Mushroom'),
(6, 'Thai'),
(7, 'Hot'),
(8, 'Chinese'),
(9, 'Pork'),
(10, 'Recommended');

-- 插入`items`表格數據
INSERT INTO items (item_id, name, description, image, price) VALUES
(1, 'Hawaiian Pizza', 'All-time favourite toppings, Hawaiian pizza in Tropical Hawaii style.', 'https://reurl.cc/RLX4RD', 300),
(2, 'Chicken Tom Yum Pizza', 'Best marinated chicken with pineapple and mushroom on Spicy Lemon sauce. Enjoy our tasty Thai style pizza.', 'https://reurl.cc/A6OqDj', 350),
(3, 'Xiaolongbao', 'Chinese steamed bun', 'https://reurl.cc/b3E5yy', 200),
(4, 'Kimchi', 'Traditional side dish made from salted and fermented vegetables', 'https://reurl.cc/L5M3OL', 50),
(5, 'Oolong Tea', 'Partially fermented tea grown in the Alishan area', 'https://reurl.cc/KdQjop', 30),
(6, 'Beer', 'Fantastic flavors and authentic regional appeal beer', 'https://reurl.cc/yDMgND', 60),
(7, 'Tempura', 'Japanese battered fried seafood and vegetables', 'https://reurl.cc/lNedWQ', 120),
(8, 'Fried Rice', 'Stir-fried rice with vegetables and eggs', 'https://reurl.cc/V01Xb5', 80),
(9, 'Spaghetti Carbonara', 'Classic Italian pasta with creamy sauce and bacon', 'https://reurl.cc/26mgRn', 150),
(10, 'Margherita Pizza', 'Classic pizza with tomato, mozzarella, and basil', 'https://reurl.cc/vpW1Nj', 200),
(11, 'Peking Duck', 'Famous Chinese dish with crispy skin and tender meat', 'https://reurl.cc/O54qyv', 250),
(12, 'Sushi', 'Japanese rice dish topped with raw fish and vegetables', 'https://reurl.cc/74po15', 220),
(13, 'Ramen', 'Japanese noodle soup with meat, egg, and vegetables', 'https://reurl.cc/5Dpqjq', 180);

-- 插入`item_detail`表格數據
INSERT INTO item_detail VALUES 
(1,1),
(1,2),
(1,3),
(2,4),
(2,5),
(2,6),
(2,7),
(3,8),
(3,9),
(3,10);

-- Insert sample orders into the `orders` table
INSERT INTO orders (order_id, item_id, quantity, order_time) VALUES
(1, 1, 1, '2017-01-01 10:00:00'),
(2, 2, 2, '2017-01-01 10:00:00'),
(3, 2, 1, '2017-01-01 11:00:00'),
(4, 3, 1, '2017-01-01 12:00:00'),
(5, 4, 1, '2017-01-01 12:00:00'),
(6, 5, 1, '2017-01-01 15:00:00'),
(7, 4, 3, '2017-01-01 15:00:00');

-- Insert sample bills into the `bills` table
INSERT INTO bills (bill_id) VALUES
(1),
(2),
(3);

-- Link bills and orders in the `bill_order` table
INSERT INTO bill_order (bill_id, order_id) VALUES
(1, 1),  -- Hawaiian Pizza
(1, 2),  -- Kimchi (Quantity 2)
(1, 3),  -- Kimchi (Quantity 1)
(2, 4),  -- Xiaolongbao
(2, 5),  -- Beer
(3, 6),  -- Oolong tea
(3, 7);  -- Beer (Quantity 3)

