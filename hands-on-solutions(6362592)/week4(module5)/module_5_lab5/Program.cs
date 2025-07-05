using System;
using System.Threading.Tasks;
using Microsoft.EntityFrameworkCore;
using RetailInventory.Models;

class Program
{
    static async Task Main(string[] args)
    {
        using var context = new AppDbContext();

        // Retrieve all products
        var products = await context.Products.Include(p => p.Category).ToListAsync();
        Console.WriteLine("All Products:");
        foreach (var p in products)
            Console.WriteLine($"{p.Name} - ₹{p.Price} - Category: {p.Category.Name}");

        // Find by ID
        var product = await context.Products.FindAsync(1);
        Console.WriteLine($"\nFind by ID (1): {product?.Name}");

        // First product with price > 50,000
        var expensive = await context.Products.FirstOrDefaultAsync(p => p.Price > 50000);
        Console.WriteLine($"Expensive Product: {expensive?.Name}");
    }
}
