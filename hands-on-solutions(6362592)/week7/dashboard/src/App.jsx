import React from "react";
import CohortDetails from "./Cohort";

function App() {
  const cohorts = [
    {
      name: "React Basics",
      trainer: "Shivam Roy",
      status: "ongoing",
      startDate: "2025-07-01",
      endDate: "2025-08-01"
    },
    {
      name: "Advanced JS",
      trainer: "Ankita Jain",
      status: "completed",
      startDate: "2025-05-10",
      endDate: "2025-06-10"
    }
  ];

  return (
    <div>
      {cohorts.map((cohort, idx) => (
        <CohortDetails key={idx} cohort={cohort} />
      ))}
    </div>
  );
}

export default App;
