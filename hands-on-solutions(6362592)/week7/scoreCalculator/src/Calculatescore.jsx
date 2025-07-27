
import './calculatescore.css';

function CalculateScore(props) {
    const { name, school, total, goal } = props;
    const average = total / goal;

    return (
        <div className="score-container">
            <h2>Student Score Summary</h2>
            <p><strong>Name:</strong> {name}</p>
            <p><strong>School:</strong> {school}</p>
            <p><strong>Total Marks:</strong> {total}</p>
            <p><strong>Goal:</strong> {goal}</p>
            <p><strong>Average Score:</strong> {average.toFixed(2)}</p>
        </div>
    );
}

export default CalculateScore;
