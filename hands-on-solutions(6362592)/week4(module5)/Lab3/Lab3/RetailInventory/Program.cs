using Microsoft.EntityFrameworkCore;
using RetailInventory.Data;
using RetailInventory.Models;

using var context = new AppDbContext();

// Ensure database exists
context.Database.EnsureCreated();

// Add a category if not exists
if (!context.Categories.Any())
{
    var electronics = new Category { Name = "Electronics" };
    electronics.Products.Add(new Product
    {
        Name = "Laptop",
        QuantityInStock = 10,
        Price = 75000
    });

    context.Categories.Add(electronics);
    context.SaveChanges();
}

// Display all products
var products = context.Products.Include(p => p.Category).ToList();

foreach (var product in products)
{
    Console.WriteLine($"{product.Name} ({product.Category?.Name}) - {product.QuantityInStock} in stock - ₹{product.Price}");
}
